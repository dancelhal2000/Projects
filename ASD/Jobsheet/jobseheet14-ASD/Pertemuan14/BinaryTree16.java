public class BinaryTree16 {
    Node16 root;

    public BinaryTree16() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void addRekursif(Node16 node, Mahasiswa16 mahasiswa) {
        if (node == null) {
            root = new Node16(mahasiswa);
        } else if (mahasiswa.ipk < node.data.ipk) {
            if (node.left == null) {
                node.left = new Node16(mahasiswa);
            } else {
                addRekursif(node.left, mahasiswa);
            }
        } else if (mahasiswa.ipk > node.data.ipk) {
            if (node.right == null) {
                node.right = new Node16(mahasiswa);
            } else {
                addRekursif(node.right, mahasiswa);
            }
        }
    }

    public void add(Mahasiswa16 mahasiswa) {
        Node16 newNode = new Node16(mahasiswa);
        if (isEmpty()) {
            root = newNode;
        } else {
            Node16 current = root;
            while (true) {
                Node16 parent = current;
                if (mahasiswa.ipk < current.data.ipk) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    public boolean find(double ipk) {
        boolean result = false;
        Node16 current = root;
        while (current != null) {
            if (current.data.ipk == ipk) {
                result = true;
                break;
            } else if (ipk > current.data.ipk) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return result;
    }

    public void cariMinIPK() {
        if (isEmpty()) {
            System.out.println("Tree kosong");
            return;
        }
        Node16 current = root;
        while (current.left != null) {
            current = current.left;
        }
        System.out.print("Mahasiswa dengan IPK terkecil: ");
        current.data.tampilInformasi();
    }

    public void cariMaxIPK() {
        if (isEmpty()) {
            System.out.println("Tree kosong");
            return;
        }
        Node16 current = root;
        while (current.right != null) {
            current = current.right;
        }
        System.out.print("Mahasiswa dengan IPK terbesar: ");
        current.data.tampilInformasi();
    }

    public void traversePreOrder(Node16 node) {
        if (node != null) {
            node.data.tampilInformasi();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    public void traverseInOrder(Node16 node) {
        if (node != null) {
            traverseInOrder(node.left);
            node.data.tampilInformasi();
            traverseInOrder(node.right);
        }
    }

    public void traversePostOrder(Node16 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            node.data.tampilInformasi();
        }
    }

    public Node16 getSuccessor(Node16 del) {
        Node16 successor = del.right;
        Node16 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    public void tampilMahasiswaIPKdiAtas(double ipkBatas) {
        tampilMahasiswaIPKdiAtas(root, ipkBatas);
    }

    private void tampilMahasiswaIPKdiAtas(Node16 node, double ipkBatas) {
        if (node != null) {
            tampilMahasiswaIPKdiAtas(node.left, ipkBatas);
            if (node.data.ipk > ipkBatas) {
                node.data.tampilInformasi();
            }
            tampilMahasiswaIPKdiAtas(node.right, ipkBatas);
        }
    }

    public void delete(double ipk) {
        if (isEmpty()) {
            System.out.println("Binary tree kosong");
            return;
        }
        Node16 parent = root;
        Node16 current = root;
        boolean isLeftChild = false;
        while (current != null) {
            if (current.data.ipk == ipk) {
                break;
            } else if (ipk < current.data.ipk) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (ipk > current.data.ipk) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        if (current == null) {
            System.out.println("Data tidak ditemukan");
            return;
        } else {
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } else if (current.left == null) {
                if (current == root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            } else if (current.right == null) {
                if (current == root) {
                    root = current.left;
                } else {
                    if (isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            } else {
                Node16 successor = getSuccessor(current);
                // System.out.println("Jika 2 anak, current = ");
                // successor.data.tampilInformasi();
                if (current == root) {
                    root = successor;
                } else if (isLeftChild) {
                    parent.left = successor;
                } else {
                    parent.right = successor;
                }
                successor.left = current.left;
            }
        }
    }
}