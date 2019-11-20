package org.openapitools.api

import org.openapitools.model.ExpenseRequest
import org.openapitools.model.ExpenseResponse
import org.openapitools.model.ExpensesResponse
import org.openapitools.model.NotFound
import org.openapitools.model.ResultResponse
import org.junit.jupiter.api.Test

import org.springframework.http.ResponseEntity

class DefaultApiTest {

    
    private val api: DefaultApiController = DefaultApiController()

    
    /**
    * adds a expense
    *
    * 支出を登録する
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun addExpenseTest() {
        val expenseRequest:ExpenseRequest? = null
        val response: ResponseEntity<Unit> = api.addExpense(expenseRequest!!)

        // TODO: test validations
    }
    
    /**
    * gets a expense
    *
    * 支出詳細を取得する 
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun getExpenseTest() {
        val expenseId:kotlin.String? = null
        val response: ResponseEntity<ExpenseResponse> = api.getExpense(expenseId!!)

        // TODO: test validations
    }
    
    /**
    * gets expenses
    *
    * 支出一覧を取得する
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun getExpensesTest() {
        val beginDate:java.time.LocalDate? = null
        val endDate:java.time.LocalDate? = null
        val response: ResponseEntity<ExpensesResponse> = api.getExpenses(beginDate!!, endDate!!)

        // TODO: test validations
    }
    
    /**
    * gets Result
    *
    * その月の収支結果を取得する 
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun getResultTest() {
        val resultId:kotlin.String? = null
        val response: ResponseEntity<ResultResponse> = api.getResult(resultId!!)

        // TODO: test validations
    }
    
}
