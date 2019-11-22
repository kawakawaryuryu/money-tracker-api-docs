package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ResultResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-11-22T19:01:18.210+09:00[Asia/Tokyo]")

public class ResultResponse   {
  @JsonProperty("id")
  private LocalDate id;

  @JsonProperty("totalExpense")
  private Integer totalExpense;

  @JsonProperty("expenseGoal")
  private Integer expenseGoal;

  @JsonProperty("balance")
  private Integer balance;

  public ResultResponse id(LocalDate id) {
    this.id = id;
    return this;
  }

  /**
   * 該当月（yyyy-MM）
   * @return id
  */
  @ApiModelProperty(value = "該当月（yyyy-MM）")

  @Valid

  public LocalDate getId() {
    return id;
  }

  public void setId(LocalDate id) {
    this.id = id;
  }

  public ResultResponse totalExpense(Integer totalExpense) {
    this.totalExpense = totalExpense;
    return this;
  }

  /**
   * その月の支出合計
   * minimum: 0
   * @return totalExpense
  */
  @ApiModelProperty(example = "10000", value = "その月の支出合計")

@Min(0)
  public Integer getTotalExpense() {
    return totalExpense;
  }

  public void setTotalExpense(Integer totalExpense) {
    this.totalExpense = totalExpense;
  }

  public ResultResponse expenseGoal(Integer expenseGoal) {
    this.expenseGoal = expenseGoal;
    return this;
  }

  /**
   * その月の支出目標
   * @return expenseGoal
  */
  @ApiModelProperty(example = "5000", value = "その月の支出目標")


  public Integer getExpenseGoal() {
    return expenseGoal;
  }

  public void setExpenseGoal(Integer expenseGoal) {
    this.expenseGoal = expenseGoal;
  }

  public ResultResponse balance(Integer balance) {
    this.balance = balance;
    return this;
  }

  /**
   * その月の差額
   * @return balance
  */
  @ApiModelProperty(example = "-5000", value = "その月の差額")


  public Integer getBalance() {
    return balance;
  }

  public void setBalance(Integer balance) {
    this.balance = balance;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResultResponse resultResponse = (ResultResponse) o;
    return Objects.equals(this.id, resultResponse.id) &&
        Objects.equals(this.totalExpense, resultResponse.totalExpense) &&
        Objects.equals(this.expenseGoal, resultResponse.expenseGoal) &&
        Objects.equals(this.balance, resultResponse.balance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, totalExpense, expenseGoal, balance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResultResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    totalExpense: ").append(toIndentedString(totalExpense)).append("\n");
    sb.append("    expenseGoal: ").append(toIndentedString(expenseGoal)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
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

