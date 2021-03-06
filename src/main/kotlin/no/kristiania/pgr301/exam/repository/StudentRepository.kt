package no.kristiania.pgr301.exam.repository

import no.kristiania.pgr301.exam.entity.Student
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface StudentRepository : CrudRepository<Student, String> {
    fun findByStudentId(studentId: String): Student?
}