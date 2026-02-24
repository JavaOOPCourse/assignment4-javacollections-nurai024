package service;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ActionHistoryService {

    private ArrayDeque<String> actions = new ArrayDeque<>();

    public void initializeActions() {
        actions.clear();
        actions.addLast("Submitted Assignment");
        actions.addLast("Dropped Course");
        actions.addLast("Registered Course");
        actions.addLast("Updated Profile");
    }

    public void undoLastAction() {
        if (actions.isEmpty()) {
            System.out.println("No actions to undo.");
            return;
        }
        String removed = actions.removeLast();
        System.out.println("Undone last action: " + removed);
    }

    public void addRequestedTranscript() {
        actions.addLast("Requested Transcript");
        System.out.println("Added action: Requested Transcript");
    }

    public void showFirstAndLast() {
        if (actions.isEmpty()) {
            System.out.println("No actions available.");
            return;
        }
        System.out.println("First action: " + actions.getFirst());
        System.out.println("Last action: " + actions.getLast());
    }

    public void printHistory() {
        System.out.println("=== Action History ===");
        Iterator<String> it = actions.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}