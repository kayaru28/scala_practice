object UserID{
    def apply(name:String) = s"$name--generatedID--yyyymmdd"
    def unapply(user_id:String):Option[String] = {
        val stringArray: Array[String] = user_id.split("--")
        if (stringArray.tail.nonEmpty) Some(stringArray.head) else None
    }
}
val user = UserID("takuya")
println(user)
println(UserID(user))
println(user.getClass)