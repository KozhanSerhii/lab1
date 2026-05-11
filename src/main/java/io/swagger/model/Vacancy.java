package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import org.openapitools.jackson.nullable.JsonNullable;
import io.swagger.configuration.NotUndefined;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Vacancy
 */
@Validated
@NotUndefined
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2026-04-28T20:38:41.609801331Z[GMT]")


public class Vacancy   {
  @JsonProperty("id")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Integer id = null;

  @JsonProperty("employerId")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Integer employerId = null;

  @JsonProperty("positionTitle")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String positionTitle = null;

  @JsonProperty("salary")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private BigDecimal salary = null;

  @JsonProperty("requirements")
  @Valid
  private List<String> requirements = null;
  @JsonProperty("socialBenefits")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String socialBenefits = null;


  public Vacancy id(Integer id) { 

    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  
  @Schema(description = "")
  
  public Integer getId() {  
    return id;
  }



  public void setId(Integer id) { 
    this.id = id;
  }

  public Vacancy employerId(Integer employerId) { 

    this.employerId = employerId;
    return this;
  }

  /**
   * Get employerId
   * @return employerId
   **/
  
  @Schema(description = "")
  
  public Integer getEmployerId() {  
    return employerId;
  }



  public void setEmployerId(Integer employerId) { 
    this.employerId = employerId;
  }

  public Vacancy positionTitle(String positionTitle) { 

    this.positionTitle = positionTitle;
    return this;
  }

  /**
   * Get positionTitle
   * @return positionTitle
   **/
  
  @Schema(description = "")
  
  public String getPositionTitle() {  
    return positionTitle;
  }



  public void setPositionTitle(String positionTitle) { 
    this.positionTitle = positionTitle;
  }

  public Vacancy salary(BigDecimal salary) { 

    this.salary = salary;
    return this;
  }

  /**
   * Get salary
   * @return salary
   **/
  
  @Schema(description = "")
  
@Valid
  public BigDecimal getSalary() {  
    return salary;
  }



  public void setSalary(BigDecimal salary) { 
    this.salary = salary;
  }

  public Vacancy requirements(List<String> requirements) { 

    this.requirements = requirements;
    return this;
  }

  public Vacancy addRequirementsItem(String requirementsItem) {
    if (this.requirements == null) {
      this.requirements = new ArrayList<String>();
    }
    this.requirements.add(requirementsItem);
    return this;
  }

  /**
   * Get requirements
   * @return requirements
   **/
  
  @Schema(description = "")
  
  public List<String> getRequirements() {  
    return requirements;
  }



  public void setRequirements(List<String> requirements) { 
    this.requirements = requirements;
  }

  public Vacancy socialBenefits(String socialBenefits) { 

    this.socialBenefits = socialBenefits;
    return this;
  }

  /**
   * Get socialBenefits
   * @return socialBenefits
   **/
  
  @Schema(description = "")
  
  public String getSocialBenefits() {  
    return socialBenefits;
  }



  public void setSocialBenefits(String socialBenefits) { 
    this.socialBenefits = socialBenefits;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Vacancy vacancy = (Vacancy) o;
    return Objects.equals(this.id, vacancy.id) &&
        Objects.equals(this.employerId, vacancy.employerId) &&
        Objects.equals(this.positionTitle, vacancy.positionTitle) &&
        Objects.equals(this.salary, vacancy.salary) &&
        Objects.equals(this.requirements, vacancy.requirements) &&
        Objects.equals(this.socialBenefits, vacancy.socialBenefits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, employerId, positionTitle, salary, requirements, socialBenefits);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Vacancy {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    employerId: ").append(toIndentedString(employerId)).append("\n");
    sb.append("    positionTitle: ").append(toIndentedString(positionTitle)).append("\n");
    sb.append("    salary: ").append(toIndentedString(salary)).append("\n");
    sb.append("    requirements: ").append(toIndentedString(requirements)).append("\n");
    sb.append("    socialBenefits: ").append(toIndentedString(socialBenefits)).append("\n");
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
