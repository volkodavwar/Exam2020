package exam

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class ExamTest {

    @Test
    fun testExample() {
        assertEquals(42, example("input/example.txt"))
    }

    @Test
    fun patientsForAnalysis() {
        assertEquals(setOf("Сидоров", "Петров"), patientsForAnalysis("input/polyclinic.txt", "МРТ Сердца"))
        assertEquals(setOf<String>(), patientsForAnalysis("input/polyclinic.txt", ""))
        assertEquals(setOf<String>(), patientsForAnalysis("input/polyclinic.txt", "МРТ Сердцев"))
        assertEquals(setOf("Сидоров", "Петров"), patientsForAnalysis("input/polyclinic.txt", "мрт сердца"))
        assertEquals(setOf("Иванов"), patientsForAnalysis("input/polyclinic.txt", "УЗИ легких"))
        assertEquals(setOf("Иванов"), patientsForAnalysis("input/polyclinic.txt", "узи легких"))
        assertEquals(setOf<String>(), patientsForAnalysis("input/empty.txt", "МРТ Головного Мозга"))
        assertEquals(setOf<String>(), patientsForAnalysis("input/empty.txt", ""))
    }
}