package exam

import java.io.File

fun example(inputName: String): Int {
    if ("ultimate question" in File(inputName).readText().toLowerCase()) {
        return 42
    }
    throw IllegalStateException()
}

// Пожалуйста добавьте необходимые параметры,
// тип результата, и измените имя функции (Shift+F6)
fun patientsForAnalysis(inputName: String, analysis: String): Set<String> {
    val patients = mutableSetOf<String>()

    File(inputName).bufferedReader().forEachLine { line ->
        val split = line.split(" ")

        if (split.size < 4)
            throw IllegalArgumentException("Invalid format of input file ${inputName}!")

        var currentAnalysis = split.subList(3, split.size).joinToString(separator = " ")
        currentAnalysis = currentAnalysis.substring(1 until currentAnalysis.length - 1)

        if (analysis.equals(currentAnalysis, true)) {
            patients.add(split[0])
        }
    }


    return patients
}