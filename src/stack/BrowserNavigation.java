package stack;

import java.util.Stack;

public class BrowserNavigation {
    private Stack<String> backStack = new Stack<>();
    private Stack<String> forwardStack = new Stack<>();
    private String currentPage = null;

    public void visit(String url) {
        if (currentPage != null) {
            backStack.push(currentPage);
        }
        currentPage = url;
        forwardStack.clear(); // Clear forward stack on new visit
        System.out.println("Visiting: " + url);
    }

    public void back() {
        if (!backStack.isEmpty()) {
            forwardStack.push(currentPage);
            currentPage = backStack.pop();
            System.out.println("Back to: " + currentPage);
        } else {
            System.out.println("No pages in back stack");
        }
    }

    public void forward() {
        if (!forwardStack.isEmpty()) {
            backStack.push(currentPage);
            currentPage = forwardStack.pop();
            System.out.println("Forward to: " + currentPage);
        } else {
            System.out.println("No pages in forward stack");
        }
    }

    public static void main(String[] args) {
        BrowserNavigation browser = new BrowserNavigation();
        browser.visit("page1.com");
        browser.visit("page2.com");
        browser.visit("page3.com");
        browser.back();
        browser.back();
        browser.forward();
        browser.visit("page4.com");
        browser.back();
    }
}
