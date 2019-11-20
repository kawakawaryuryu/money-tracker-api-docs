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
 * @param id 該当月（yyyy-MM）
 * @param totalExpense その月の支出合計
 * @param expenseGoal その月の支出目標
 * @param balance その月の差額
 */
data class ResultResponse (

        @JsonProperty("id") val id: java.time.LocalDate? = null,
@get:Min(0)
        @JsonProperty("totalExpense") val totalExpense: kotlin.Int? = null,

        @JsonProperty("expenseGoal") val expenseGoal: kotlin.Int? = null,

        @JsonProperty("balance") val balance: kotlin.Int? = null
) {

}

