package com.quizappAD

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    
    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        // 1
        val que1 = Question(
            1, "What country does this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina", "Australia",
            "Armenia", "Austria", 1
        )

        questionsList.add(que1)

        // 2
        val que2 = Question(
            2, "What country does this flag belong to?",
            R.drawable.ic_flag_of_australia,
            "Angola", "Austria",
            "Australia", "Armenia", 3
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "What country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            "Belarus", "Belize",
            "Brunei", "Brazil", 4
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "What country does this flag belong to?",
            R.drawable.ic_flag_of_belgium,
            "Bahamas", "Belgium",
            "Barbados", "Belize", 2
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "What country does this flag belong to?",
            R.drawable.ic_flag_of_fiji,
            "Gabon", "France",
            "Fiji", "Finland", 3
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
            6, "What country does this flag belong to?",
            R.drawable.ic_flag_of_germany,
            "Germany", "Georgia",
            "Greece", "none of these", 1
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
            7, "What country does this flag belong to?",
            R.drawable.ic_flag_of_denmark,
            "Dominica", "Egypt",
            "Denmark", "Ethiopia", 3
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
            8, "What country does this flag belong to?",
            R.drawable.ic_flag_of_india,
            "Ireland", "Iran",
            "Hungary", "India", 4
        )

        questionsList.add(que8)

        // 9
        val que9 = Question(
            9, "What country does this flag belong to?",
            R.drawable.ic_flag_of_new_zealand,
            "Australia", "New Zealand",
            "Tuvalu", "United States of America", 2
        )

        questionsList.add(que9)

        // 10
        val que10 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Kuwait", "Jordan",
            "Sudan", "Palestine", 1
        )

        questionsList.add(que10)

        // 11
        val que11 = Question(
            11, "What is the capital of India?",
            R.drawable.ic_flag_of_india,
            "Delhi", "California",
            "New York", "Mumbai", 1
        )

        questionsList.add(que11)

        // 12
        val que12 = Question(
            12, "What is the capital of Australia?",
            R.drawable.ic_flag_of_australia,
            "Spain", "California",
            "Delhi", "Canberra", 4
        )

        questionsList.add(que12)

        // 13
        val que13 = Question(
            13, "What is the capital of Germany?",
            R.drawable.ic_flag_of_germany,
            "Delhi", "Berlin",
            "Kathmandu", "New York", 2
        )

        questionsList.add(que13)

        // 14
        val que14 = Question(
            14, "What is largest city of New Zealand",
            R.drawable.ic_flag_of_new_zealand,
            "New York", "Spain",
            "Auckland", "Old York", 3
        )

        questionsList.add(que14)

        // 15
        val que15 = Question(
            15, "What is the capital of Kuwait?",
            R.drawable.ic_flag_of_kuwait,
            "California", "Kuwait city",
            "New York", "Berlin", 2
        )

        questionsList.add(que15)

        return questionsList
    }
}