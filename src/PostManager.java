import java.util.*;

public class PostManager {

    public int calculateEngagement(int... interactions) {
        if (interactions == null || interactions.length == 0) {
            return 0;
        }
        int total = 0;
        for (int interaction : interactions) {
            total += interaction;
        }
        return total;
    }

    public String getCategoryRating(int engagementScore) {
        if (engagementScore >= 1000) {
            return "Viral";
        } else if (engagementScore >= 500) {
            return "Popular";
        } else if (engagementScore >= 100) {
            return "Good";
        } else if (engagementScore >= 50) {
            return "Low";
        } else {
            return "Poor";
        }
    }

    public void displayPostStats(String postTitle, int engagementScore) {
        System.out.println("Post: " + postTitle);
        System.out.println("Engagement Score: " + engagementScore);
    }

    public void displayPostStats(String postTitle, int engagementScore, String category) {
        System.out.println("Post: " + postTitle);
        System.out.println("Engagement Score: " + engagementScore);
        System.out.println("Category: " + category);
    }

    public ArrayList<String> manageHashtags(String[] hashtags) {
        if (hashtags == null || hashtags.length == 0) {
            return new ArrayList<>();
        }

        int limit = Math.min(hashtags.length, 5);
        HashSet<String> uniqueSet = new HashSet<>();

        for (int i = 0; i < limit; i++) {
            if (hashtags[i] != null && !hashtags[i].trim().isEmpty()) {
                uniqueSet.add(hashtags[i]);
            }
        }

        return new ArrayList<>(uniqueSet);
    }

    public LinkedList<String> findTrendingPosts(ArrayList<String> posts, HashMap<String, Integer> postEngagement) {
        LinkedList<String> trending = new LinkedList<>();

        if (posts == null || postEngagement == null) {
            return trending;
        }

        for (String post : posts) {
            if (postEngagement.containsKey(post)) {
                int score = postEngagement.get(post);
                if (score > 500) {
                    trending.add(post);
                }
            }
        }

        return trending;
    }

    public HashSet<String> getUniqueAuthors(String... authors) {
        HashSet<String> uniqueAuthors = new HashSet<>();
        if (authors == null) return uniqueAuthors;

        for (String author : authors) {
            if (author != null && !author.trim().isEmpty()) {
                uniqueAuthors.add(author);
            }
        }

        return uniqueAuthors;
    }

