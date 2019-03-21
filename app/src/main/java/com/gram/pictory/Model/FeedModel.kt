package com.gram.pictory.Model

data class FeedModel (
    var user: String,
    var imgUrl: String,
    var likeCount: Int,
    var replyCount: Int,
    var postText: String
)