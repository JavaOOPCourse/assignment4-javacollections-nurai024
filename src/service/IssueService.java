package service;

import model.Issue;
import java.util.PriorityQueue;
import java.util.Iterator;

public class IssueService {

    private PriorityQueue<Issue> issues = new PriorityQueue<>();

    public void initializeIssues() {
        issues.clear();
        issues.add(new Issue("Lost student ID card", 4));
        issues.add(new Issue("Exam conflict (two exams same time)", 1));
        issues.add(new Issue("Scholarship document problem", 2));
        issues.add(new Issue("Course registration error", 3));
        issues.add(new Issue("Graduation eligibility issue", 1));
    }

    public void showMostUrgent() {
        if (issues.isEmpty()) {
            System.out.println("No issues in queue.");
            return;
        }
        System.out.println("Most urgent issue: " + issues.peek());
    }

    public void resolveIssues() {
        for (int i = 0; i < 2; i++) {
            if (issues.isEmpty()) {
                System.out.println("No more issues to resolve.");
                return;
            }
            Issue removed = issues.poll();
            System.out.println("Resolved: " + removed);
        }
    }

    public void printRemainingIssues() {
        System.out.println("=== Remaining Issues (Iterator order is NOT sorted) ===");
        Iterator<Issue> it = issues.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public void addNewIssue(String description, int urgency) {
        if (urgency < 1) urgency = 1;
        issues.add(new Issue(description, urgency));
        System.out.println("Added new issue.");
    }
}