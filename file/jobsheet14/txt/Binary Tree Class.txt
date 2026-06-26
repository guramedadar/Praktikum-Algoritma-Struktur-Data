package com.jobsheet14;

public class BinaryTree8 
{
    Node8 root;

    BinaryTree8()
    {
        root = null;
    }

    public boolean isEmpty()
    {
        return root == null;
    }

    public void add (Student8 data)
    {
        if (isEmpty())
            root = new Node8(data);
        else
        {
            Node8 current = root;

            while (true) 
            { 
                if (data.ipk < current.data.ipk) 
                {
                    if (current.left != null)
                        current = current.left;
                    else
                    {
                        current.left = new Node8(data);
                        break;
                    }    
                }
                else if (data.ipk > current.data.ipk)
                {
                    if (current.right != null)
                        current = current.right;
                    else
                    {
                        current.right = new Node8(data);
                        break;
                    }
                }
                else
                    break;    
            }
        }
    }

    public boolean find (double ipk)
    {
        boolean result = false;
        Node8 current = root;

        while (current != null)
        {
            if (current.data.ipk == ipk) 
            {
                result = true;
                break;
            }
            else if (ipk < current.data.ipk)
                current = current.left;
            else
                current = current.right;
        }

        return result;
    }

    public void traversePreOrder (Node8 node)
    {
        if (node != null) 
        {
            node.data.print();
            traversePreOrder(node.left);
            traversePreOrder(node.right);    
        }
    }

    public void traverseInOrder (Node8 node)
    {
        if (node != null)
        {
            traverseInOrder(node.left);
            node.data.print();
            traverseInOrder(node.right);
        }
    }
    
    public void traversePostOrder (Node8 node)
    {
        if (node != null)
        {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            node.data.print();
        }
    }

    Node8 getSuccessor (Node8 del)
    {
        Node8 successor = del.right;
        Node8 successorParent = del;

        while (successor.left != null) 
        {
            successorParent = successor;
            successor = successor.left;    
        }

        if (successor != del.right) 
        {
            successorParent.left = successor.right;
            successor.right = del.right;    
        }

        return successor;
    }

    public void delete (double ipk)
    {
        if (isEmpty()) 
        {
            System.out.println("Tree is Empty!");
            return;    
        }

        Node8 parent = root;
        Node8 current = root;
        boolean isLeftChild = false;

        while (current.data.ipk != ipk) 
        {
            parent = current;
            
            if (ipk < current.data.ipk) 
            {
                isLeftChild = true;
                current = current.left;    
            }
            else
            {
                isLeftChild = false;
                current = current.right;
            }

            if (current == null) 
            {
                System.out.println("Couldn't find data!");
                return;    
            }
        }

        if (current.left == null && current.right == null) 
        {
            if (current == root)
                root = null;
            else if (isLeftChild)
                parent.left = null;
            else
                parent.right = null;    
        }
        else if (current.right == null)
        {
            if (current == root)
                root = current.left;
            else if (isLeftChild)
                parent.left = current.left;
            else
                parent.right = current.left;
        }
        else if (current.left == null)
        {
            if (current == root)
                root = current.right;
            else if (isLeftChild)
                parent.left = current.right;
            else
                parent.right = current.right;
        }
        else
        {
            Node8 successor = getSuccessor(current);

            if (current == root)
                root = successor;
            else if (isLeftChild)
                parent.left = successor;
            else
                parent.right = successor;
            
            successor.left = current.left;
        }
    }

    public Node8 addRekursif(Node8 current, Student8 data) 
    {
        if (current == null)
            return new Node8(data);
        
        if (data.ipk < current.data.ipk) 
            current.left = addRekursif(current.left, data);
        else if (data.ipk > current.data.ipk)
            current.right = addRekursif(current.right, data);
        
        return current;
    }

    public void getMinIPK() 
    {
        if (isEmpty()) 
        {
            System.out.println("Tree is empty!");
            return;
        }

        Node8 current = root;

        while (current.left != null)
            current = current.left;

        System.out.println("Student with Minimum IPK:");
        current.data.print();
    }

    public void getMaxIPK() 
    {
        if (isEmpty()) 
        {
            System.out.println("Tree is empty!");
            return;
        }

        Node8 current = root;

        while (current.right != null)
            current = current.right;

        System.out.println("Student with Maximum IPK:");
        current.data.print();
    }

    public void displayStudentsWithIPKAbove(Node8 node, double threshold) 
    {
        if (node != null) 
        {
            displayStudentsWithIPKAbove(node.left, threshold);
            
            if (node.data.ipk > threshold)
                node.data.print();
            
            displayStudentsWithIPKAbove(node.right, threshold);
        }
    }
}
