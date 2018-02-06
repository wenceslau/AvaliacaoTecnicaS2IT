package br.wn.binarytree;

/**
 *
 * @author Wenceslau
 */
public class BinaryTree {

    public static void main(String[] args) {

        BinaryTree b = new BinaryTree(1);
        BinaryTree b1 = new BinaryTree(16);
        BinaryTree b2 = new BinaryTree(11);
        BinaryTree b3 = new BinaryTree(31);
        BinaryTree b4 = new BinaryTree(11);
        BinaryTree b5 = new BinaryTree(11);

        b.setLeft(b1);
        b.setRight(b4);
        b1.setLeft(b2);
        b1.setRight(b3);
        b2.setRight(b4);
        b5.setRight(b);

        System.out.println(BinaryTree.sum(b5));

    }
    
    private int valor;
    private BinaryTree left;
    private BinaryTree right;

    public BinaryTree(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public BinaryTree getLeft() {
        return left;
    }

    public void setLeft(BinaryTree left) {
        this.left = left;
    }

    public BinaryTree getRight() {
        return right;
    }

    public void setRight(BinaryTree right) {
        this.right = right;
    }

    public static double sum(BinaryTree root) {
        double sum, lSum, rSum;
        if (root == null) {
            sum = 0;
            return sum;
        } else {
            lSum = sum(root.getLeft());
            rSum = sum(root.getRight());
            sum = root.getValor() + lSum + rSum;
            return sum;
        }
    }

}
