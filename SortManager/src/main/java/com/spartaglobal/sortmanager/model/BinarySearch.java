package com.spartaglobal.sortmanager.model;


import java.util.ArrayList;
import java.util.Arrays;

import static com.spartaglobal.sortmanager.SorterMain.logger;

public class BinarySearch implements Sorter {

    public BinarySearch(){


        System.out.println();
        System.out.println("========== Generate Array ==========");
        System.out.println();
        int[] numberTest = NumberArray.arrayOfNumbers();
        int count = numberTest.length;
        System.out.println(Arrays.toString(numberTest));
        System.out.println();

        System.out.println("==========  Binary Search  =========");
        System.out.println();


        for(int i=0; i < numberTest.length; i++){
            addRoot(numberTest[i]);

        }
        inorder();


        System.out.println();
        System.out.println("====================================");

    }



    BinaryNode rootNode; //First Node in the Binary Search Tree.

    public void addRoot(int value) {
        logger.info("Adding Number " + value + " to binary tree");

        rootNode = addNewNode(rootNode, value); // Add Root Node to Binary Tree

    }

    private BinaryNode addNewNode(BinaryNode currentNode, int value){



        if (currentNode == null) {

            return new BinaryNode(value);
        }

        if (value < currentNode.value) {
            currentNode.left = addNewNode(currentNode.left, value); //If value is less, add to the left-hand side
        } else if (value >= currentNode.value) {
            currentNode.right = addNewNode(currentNode.right, value); //If value is more, add to the right-hand side
        } else {

            return currentNode;
        }

        return currentNode;

    }

    public boolean isEmpty(){
        return rootNode == null;
    }




    class BinaryNode { // Each Value will be assigned into a Node
        int value;
        BinaryNode left; // Left Branch, lower value
        BinaryNode right; // Right Branch, higher value

        BinaryNode(int value) {
            this.value = value;
            right = null; //Declared for assigning later
            left = null;

        }

    }





//    private BinarySearch createBinaryTree() {
//        BinarySearch bt = new BinarySearch();
//
//        bt.addRoot(6);
//
//        bt.addRoot(4);
//        bt.addRoot(8);
//        bt.addRoot(3);
//        bt.addRoot(5);
//        bt.addRoot(7);
//        bt.addRoot(9);
//
//        return bt;
//    }

void inorder() {
    searchInOrder(rootNode);
}

    // recursively traverse the BST
    void searchInOrder(BinaryNode rootNode) {
        if (rootNode != null) {
            searchInOrder(rootNode.left);
            System.out.print(rootNode.value + " ");
            searchInOrder(rootNode.right);
        }
    }


//    public static void main(String[] args) {
//        int[] numberTest = NumberArray.arrayOfNumbers();
//        int count = numberTest.length;
//        System.out.println(numberTest.length);
//        BinarySearch searcher = new BinarySearch();
//
//        for(int i=0; i < numberTest.length; i++){
//            searcher.addRoot(numberTest[i]);
//
//        }
//        searcher.inorder();
//
//
//    }


    @Override
    public String sort() {
        return "";
    }
}
