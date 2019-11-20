package org.openapitools.api

import org.openapitools.model.ExpenseRequest
import org.openapitools.model.ExpenseResponse
import org.openapitools.model.ExpensesResponse
import org.openapitools.model.NotFound
import org.openapitools.model.ResultResponse
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity

import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestPart
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestHeader
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.validation.annotation.Validated
import org.springframework.web.context.request.NativeWebRequest
import org.springframework.beans.factory.annotation.Autowired

import javax.validation.Valid
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size

import kotlin.collections.List
import kotlin.collections.Map

@RestController
@Validated
@RequestMapping("\${api.base-path:}")
class DefaultApiController() {


    @RequestMapping(
        value = ["/v1/expenses"],
        consumes = ["application/json"],
        method = [RequestMethod.POST])
    fun addExpense( @Valid @RequestBody expenseRequest: ExpenseRequest?
): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        value = ["/v1/expenses/{expenseId}"],
        produces = ["application/json"], 
        method = [RequestMethod.GET])
    fun getExpense( @PathVariable("expenseId") expenseId: kotlin.String
): ResponseEntity<ExpenseResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        value = ["/v1/expenses"],
        produces = ["application/json"], 
        method = [RequestMethod.GET])
    fun getExpenses( @RequestParam(value = "beginDate", required = false) beginDate: java.time.LocalDate?
, @RequestParam(value = "endDate", required = false) endDate: java.time.LocalDate?
): ResponseEntity<ExpensesResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        value = ["/v1/results/{resultId}"],
        produces = ["application/json"], 
        method = [RequestMethod.GET])
    fun getResult( @PathVariable("resultId") resultId: kotlin.String
): ResponseEntity<ResultResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
