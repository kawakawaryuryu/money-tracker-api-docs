package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size

/**
 * 
 * @param amount 支出額
 * @param date 支出日付
 * @param content 支出内容
 */
data class ExpenseRequest (

        @get:NotNull @get:Min(0)
        @JsonProperty("amount") val amount: kotlin.Int,

        @get:NotNull 
        @JsonProperty("date") val date: java.time.LocalDate,

        @get:NotNull 
        @JsonProperty("content") val content: kotlin.String
) {

}

