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

import (
	"fmt"
	"net/http"
	"strings"

	"github.com/gorilla/mux"
)

type Route struct {
	Name        string
	Method      string
	Pattern     string
	HandlerFunc http.HandlerFunc
}

type Routes []Route

func NewRouter() *mux.Router {
	router := mux.NewRouter().StrictSlash(true)
	for _, route := range routes {
		var handler http.Handler
		handler = route.HandlerFunc
		handler = Logger(handler, route.Name)

		router.
			Methods(route.Method).
			Path(route.Pattern).
			Name(route.Name).
			Handler(handler)
	}

	return router
}

func Index(w http.ResponseWriter, r *http.Request) {
	fmt.Fprintf(w, "Hello World!")
}

var routes = Routes{
	{
		"Index",
		"GET",
		"/",
		Index,
	},

	{
		"AddExpense",
		strings.ToUpper("Post"),
		"/v1/expenses",
		AddExpense,
	},

	{
		"GetExpense",
		strings.ToUpper("Get"),
		"/v1/expenses/{expenseId}",
		GetExpense,
	},

	{
		"GetExpenses",
		strings.ToUpper("Get"),
		"/v1/expenses",
		GetExpenses,
	},

	{
		"GetResult",
		strings.ToUpper("Get"),
		"/v1/results/{resultId}",
		GetResult,
	},
}
