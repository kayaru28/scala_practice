
class School(){
    var members: List[Student] = Nil
    class Student(name:String){
        var name_ = name
        var skill_math = 0
        var skill_english = 0
    }
    def math_traing(){
        for(student <- members){
            student.skill_math = student.skill_math + 1
            println("%s:%d".format(student.name_,student.skill_math))
        }
    }
    def entry(new_comer:Student){
        members = new_comer :: members
    }
}

val high_school: School = new School
val taro: high_school.Student = new high_school.Student("taro")
var ziro = new high_school.Student("ziro")
high_school.entry(taro)
high_school.math_traing
high_school.entry(ziro)
high_school.math_traing

