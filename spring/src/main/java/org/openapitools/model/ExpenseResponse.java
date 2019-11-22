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
 * ExpenseResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-11-22T19:01:18.210+09:00[Asia/Tokyo]")

public class ExpenseResponse   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("amount")
  private Integer amount;

  @JsonProperty("date")
  private LocalDate date;

  @JsonProperty("content")
  private String content;

  public ExpenseResponse id(String id) {
    this.id = id;
    return this;
  }

  /**
   * 支出ID
   * @return id
  */
  @ApiModelProperty(example = "d290f1ee-6c54-4b01-90e6-d701748f0851", value = "支出ID")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ExpenseResponse amount(Integer amount) {
    this.amount = amount;
    return this;
  }

  /**
   * 支出額
   * minimum: 0
   * @return amount
  */
  @ApiModelProperty(example = "100", value = "支出額")

@Min(0)
  public Integer getAmount() {
    return amount;
  }

  public void setAmount(Integer amount) {
    this.amount = amount;
  }

  public ExpenseResponse date(LocalDate date) {
    this.date = date;
    return this;
  }

  /**
   * 支出日付
   * @return date
  */
  @ApiModelProperty(example = "Tue Oct 22 09:00:00 JST 2019", value = "支出日付")

  @Valid

  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public ExpenseResponse content(String content) {
    this.content = content;
    return this;
  }

  /**
   * 支出内容
   * @return content
  */
  @ApiModelProperty(example = "おにぎり", value = "支出内容")


  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExpenseResponse expenseResponse = (ExpenseResponse) o;
    return Objects.equals(this.id, expenseResponse.id) &&
        Objects.equals(this.amount, expenseResponse.amount) &&
        Objects.equals(this.date, expenseResponse.date) &&
        Objects.equals(this.content, expenseResponse.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, amount, date, content);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExpenseResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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

