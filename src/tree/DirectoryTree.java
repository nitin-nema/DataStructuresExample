package tree;

import java.util.*;

class DirectoryNode {
    String name;
    List<DirectoryNode> children;

    DirectoryNode(String name) {
        this.name = name;
        this.children = new ArrayList<>();
    }

    void addChild(DirectoryNode child) {
        this.children.add(child);
    }
}

public class DirectoryTree {
    DirectoryNode root;

    public DirectoryTree(String rootName) {
        this.root = new DirectoryNode(rootName);
    }

    public DirectoryNode findNode(DirectoryNode current, String name) {
        if (current.name.equals(name)) {
            return current;
        }
        for (DirectoryNode child : current.children) {
            DirectoryNode result = findNode(child, name);
            if (result != null) {
                return result;
            }
        }
        return null;
    }

    public void add(String parentName, String childName) {
        DirectoryNode parentNode = findNode(root, parentName);
        if (parentNode != null) {
            parentNode.addChild(new DirectoryNode(childName));
        } else {
            System.out.println("Parent directory not found: " + parentName);
        }
    }

    public void display(DirectoryNode current, String indent) {
        System.out.println(indent + current.name);
        for (DirectoryNode child : current.children) {
            display(child, indent + "    ");
        }
    }

    public boolean search(DirectoryNode current, String name) {
        if (current.name.equals(name)) {
            return true;
        }
        for (DirectoryNode child : current.children) {
            if (search(child, name)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        DirectoryTree tree = new DirectoryTree("root");

        // Adding directories and files
        tree.add("root", "documents");
        tree.add("root", "photos");
        tree.add("documents", "report.docx");
        tree.add("photos", "summer");
        tree.add("summer", "beach.jpg");

        // Display directory structure
        System.out.println("Directory Structure:");
        tree.display(tree.root, "");

        // Search for a file
        String searchFile = "beach.jp";
        boolean found = tree.search(tree.root, searchFile);
        System.out.println("\nSearch for '" + searchFile + "': " + (found ? "Found" : "Not Found"));
    }
}
