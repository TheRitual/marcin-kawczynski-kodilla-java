package com.kodilla.testing.ForumUser;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Forum {
    private List<ForumUser> usersDB;
    private List<ForumPost> postsDB;
    private List<ForumComment> commentsDB;

    public Forum() {
        this.usersDB = new ArrayList<>();
        this.postsDB = new ArrayList<>();
        this.commentsDB = new ArrayList<>();
    }

    public void addUser(String userName, String realName) {
        //adding user
    }

    public void addPost(String userUuid, String postBody){
        //adding post
    }

    public void addComment(String userUuid, String postUuid, String commentBody){
        //adding comment
    }

    public int getUsersQuantity(){
        //returns amount of users in DB
        return 999;
    }

    public int getPostsQuantity(){
        //returns amount of posts in DB
        return 999;
    }

    public int getCommentsQuantity(){
        //returns amount of comments in DB
        return 999;
    }

    public ForumPost getPost(String postUuid){
        //returns post with specific UUID
        return new ForumPost("a","c");
    }

    public ForumPost getPost(int postNumber){
        //returns post at position number
        return new ForumPost("a","c");
    }

    public ForumUser getUser(String userUuid){
        //returns post with specific UUID
        return new ForumUser("a","b");
    }

    public ForumUser getUser(int userNumber){
        //returns user at position number
        return new ForumUser("a","b");
    }

    public ForumComment getComment(String commentUuid){
        //returns comment with specific UUID
        return new ForumComment("a","b","c");
    }

    public ForumComment getComment(int commentNumber){
        //returns comment at position number
        return new ForumComment("a","b","c");
    }

    public boolean removePost(String postUuid) {
        //removes post with uuid postUuid
        return false;
    }

    public boolean removePost(int postNumber) {
        //remove post number postNumber
        return false;
    }

    public boolean removeComment(String commentUuid) {
        //removes post with uuid postUuid
        return false;
    }

    public boolean removeComment(int commentNumber) {
        //remove post number postNumber
        return false;
    }

    public Stream getUsersStream() {
        return usersDB.stream();
    }

    public Stream getPostsStream() {
        return postsDB.stream();
    }

    public Stream<ForumComment> getCommentsStream() {
        return commentsDB.stream();
    }
}
