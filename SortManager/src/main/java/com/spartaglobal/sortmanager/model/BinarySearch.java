package com.spartaglobal.sortmanager.model;


public class BinarySearch implements Sorter {


    BinaryNode rootNode; //First Node in the Binary Search Tree.

    public void addRoot(int value) {
        System.out.println("Adding Number " + value + " to binary tree");
        rootNode = addNewNode(rootNode, value); // Add Root Node to Binary Tree

    }

    private BinaryNode addNewNode(BinaryNode currentNode, int value){



        if (currentNode == null) {

            return new BinaryNode(value);
        }

        if (value < currentNode.value) {
            currentNode.left = addNewNode(currentNode.left, value); //If value is less, add to the left-hand side
        } else if (value > currentNode.value) {
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


    public void searchInOrder(BinaryNode node) {
        if (node != null) {
            searchInOrder(node.left);
            System.out.print(" " + node.value);
            searchInOrder(node.right);
        }
    }

    public static void main(String[] args) {
        int[] numberTest = NumberArray.arrayOfNumbers();
        int count = numberTest.length;

        BinarySearch searcher = new BinarySearch();

        for(int i=0; i < numberTest.length; i++){
            searcher.addRoot(numberTest[i]);

        }



    }


    @Override
    public String sort() {
        return null;
    }
}
