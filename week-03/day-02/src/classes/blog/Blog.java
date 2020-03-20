package classes.blog;

import classes.BlogPost.BlogPost;

import java.util.ArrayList;
import java.util.List;

public class Blog {

    List<BlogPost> posts;

    public Blog() {
        this.posts = new ArrayList<>();
    }

    public void add(BlogPost post) {
        if (post != null) {
            posts.add(post);
        }
    }

    public void delete(int i) {
        try {
            posts.remove(i);
        } catch (IndexOutOfBoundsException e){
            System.out.println("There is no element in the posts list with that index.");
        }
    }

    public void update(int i, BlogPost newPost) {
        try {
            posts.remove(i);
            posts.add(i, newPost);
        } catch (Exception e) {
            System.out.println("Something went wrong with updating. Try again.");
        }
    }
}
