/*
 * Money Tracker API
 *
 * This is a money tracker api
 *
 * API version: 1.0.0
 * Contact: kawakawaryuryu@hotmail.co.jp
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

type ResultResponse struct {

	// 該当月（yyyy-MM）
	Id string `json:"id,omitempty"`

	// その月の支出合計
	TotalExpense int32 `json:"totalExpense,omitempty"`

	// その月の支出目標
	ExpenseGoal int32 `json:"expenseGoal,omitempty"`

	// その月の差額
	Balance int32 `json:"balance,omitempty"`
}