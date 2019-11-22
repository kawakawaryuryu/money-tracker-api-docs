package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.ExpenseResponse;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ExpensesResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-11-22T19:01:18.210+09:00[Asia/Tokyo]")

public class ExpensesResponse   {
  @JsonProperty("expenses")
  @Valid
  private List<ExpenseResponse> expenses = null;

  public ExpensesResponse expenses(List<ExpenseResponse> expenses) {
    this.expenses = expenses;
    return this;
  }

  public ExpensesResponse addExpensesItem(ExpenseResponse expensesItem) {
    if (this.expenses == null) {
      this.expenses = new ArrayList<>();
    }
    this.expenses.add(expensesItem);
    return this;
  }

  /**
   * 支出一覧リスト
   * @return expenses
  */
  @ApiModelProperty(value = "支出一覧リスト")

  @Valid

  public List<ExpenseResponse> getExpenses() {
    return expenses;
  }

  public void setExpenses(List<ExpenseResponse> expenses) {
    this.expenses = expenses;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExpensesResponse expensesResponse = (ExpensesResponse) o;
    return Objects.equals(this.expenses, expensesResponse.expenses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expenses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExpensesResponse {\n");
    
    sb.append("    expenses: ").append(toIndentedString(expenses)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

