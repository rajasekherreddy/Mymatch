package com.connect.model

import com.google.gson.annotations.SerializedName

data class ProfileInfo(

	@field:SerializedName("max_age")
	val maxAge: String? = null,

	@field:SerializedName("is_interest")
	val isInterest: Int? = null,

	@field:SerializedName("city")
	val city: String? = null,

	@field:SerializedName("dob")
	val dob: String? = null,

	@field:SerializedName("nickname")
	val nickname: String? = null,

	@field:SerializedName("is_fav")
	val isFav: Int? = null,

	@field:SerializedName("seeking_for")
	val seekingFor: String? = null,

	@field:SerializedName("min_age")
	val minAge: String? = null
)

data class UserResponse(

	@field:SerializedName("profile_info")
	val profileInfo: ProfileInfo? = null,

	@field:SerializedName("message")
	val message: String? = null,

	@field:SerializedName("profile_pics")
	val profilePics: List<ProfilePicsItem?>? = null,

	@field:SerializedName("status")
	val status: Int? = null
)

data class ProfilePicsItem(

	@field:SerializedName("user_id")
	val userId: String? = null,

	@field:SerializedName("added_date")
	val addedDate: String? = null,

	@field:SerializedName("profile_pic")
	val profilePic: String? = null,

	@field:SerializedName("img_id")
	val imgId: String? = null
)
