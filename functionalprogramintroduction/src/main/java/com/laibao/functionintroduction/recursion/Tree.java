package com.laibao.functionintroduction.recursion;

/**
 * Created by A on 2018/8/15.
 */
public class Tree {

    // left subtree
    public final Tree left;

    // right subtree
    public final Tree right;

    // value at this node
    public final int value;

    public Tree(Tree left, int value, Tree right) {
        this.left = left;
        this.value = value;
        this.right = right;
    }

    public final String toString() {
        String leftStr = left == null ? "^" : left.toString();
        String rightStr = right == null ? "^" : right.toString();
        return "(" + leftStr + "-" + value + "-" + rightStr + ")";
    }
}
