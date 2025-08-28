public static void main(String[] args) {
        PostManager manager = new PostManager();

        String postTitle = "Java Programming Tips";
        int engagement = manager.calculateEngagement(150, 75, 25);
        String category = manager.getCategoryRating(engagement);

        System.out.println("== Post Stats ==");
        manager.displayPostStats(postTitle, engagement);
        System.out.println();
        manager.displayPostStats(postTitle, engagement, category);

        String[] hashtags = {"#java", "#coding", "#programming", "#java", "#tips"};
        ArrayList<String> uniqueHashtags = manager.manageHashtags(hashtags);
        System.out.println("\n== Unique Hashtags ==");
        for (String tag : uniqueHashtags) {
            System.out.println(tag);
        }

        HashSet<String> uniqueAuthors = manager.getUniqueAuthors("Alice", "Bob", "Alice", "Charlie", "Bob");
        System.out.println("\n== Unique Authors ==");
        for (String author : uniqueAuthors) {
            System.out.println(author);
        }

        ArrayList<String> posts = new ArrayList<>(Arrays.asList(
                "Java Programming Tips", "Spring Boot Guide", "Data Structures", "Microservices 101"
        ));
        HashMap<String, Integer> postEngagement = new HashMap<>();
        postEngagement.put("Java Programming Tips", 250);
        postEngagement.put("Spring Boot Guide", 800);
        postEngagement.put("Data Structures", 1200);
        postEngagement.put("Microservices 101", 400);

        LinkedList<String> trendingPosts = manager.findTrendingPosts(posts, postEngagement);
        System.out.println("\n== Trending Posts (Engagement > 500) ==");
        for (String trending : trendingPosts) {
            System.out.println(trending);
        }
    }
}
