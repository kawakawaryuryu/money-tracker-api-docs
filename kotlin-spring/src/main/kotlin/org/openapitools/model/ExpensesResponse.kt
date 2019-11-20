package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.ExpenseResponse
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size

/**
 * 
 * @param expenses 支出一覧リスト
 */
data class ExpensesResponse (

        @JsonProperty("expenses") val expenses: kotlin.collections.List<ExpenseResponse>? = null
) {

}

