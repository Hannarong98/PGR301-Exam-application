package no.kristiania.pgr301.exam.entity

import no.kristiania.pgr301.exam.dto.Grade
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.ManyToOne
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull

@Entity
data class ExamResult (

        @get:NotNull
        @get:ManyToOne
        var student: Student? = null,

        @get:NotBlank
        var courseCode: String? = null,

        @get:NotBlank
        var courseName: String? = null,

        @get:NotNull
        var grade: Grade? = null,

        @get:NotNull
        @get:Min(1)
        @get:Max(3)
        var attempts: Int? = 0,

        @get:NotNull
        @get:Min(0)
        @get:Max(4)
        var timeSpentOnExamHrs: Double? = 0.0,


        @get:Id
        @get:GeneratedValue
        var resultId: Long? = null

)