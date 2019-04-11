/*
 * ORY Hydra
 * Welcome to the ORY Hydra HTTP API documentation. You will find documentation for all HTTP APIs here.
 *
 * OpenAPI spec version: latest
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.github.ory.hydra.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.github.ory.hydra.model.SwaggerJSONWebKey;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * SwaggerJSONWebKeySet swagger JSON web key set
 */
@ApiModel(description = "SwaggerJSONWebKeySet swagger JSON web key set")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-11T13:09:51.955+02:00")
public class SwaggerJSONWebKeySet {
  @JsonProperty("keys")
  private List<SwaggerJSONWebKey> keys = null;

  public SwaggerJSONWebKeySet keys(List<SwaggerJSONWebKey> keys) {
    this.keys = keys;
    return this;
  }

  public SwaggerJSONWebKeySet addKeysItem(SwaggerJSONWebKey keysItem) {
    if (this.keys == null) {
      this.keys = new ArrayList<SwaggerJSONWebKey>();
    }
    this.keys.add(keysItem);
    return this;
  }

   /**
   * The value of the \&quot;keys\&quot; parameter is an array of JWK values.  By default, the order of the JWK values within the array does not imply an order of preference among them, although applications of JWK Sets can choose to assign a meaning to the order for their purposes, if desired.
   * @return keys
  **/
  @ApiModelProperty(value = "The value of the \"keys\" parameter is an array of JWK values.  By default, the order of the JWK values within the array does not imply an order of preference among them, although applications of JWK Sets can choose to assign a meaning to the order for their purposes, if desired.")
  public List<SwaggerJSONWebKey> getKeys() {
    return keys;
  }

  public void setKeys(List<SwaggerJSONWebKey> keys) {
    this.keys = keys;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SwaggerJSONWebKeySet swaggerJSONWebKeySet = (SwaggerJSONWebKeySet) o;
    return Objects.equals(this.keys, swaggerJSONWebKeySet.keys);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keys);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SwaggerJSONWebKeySet {\n");
    
    sb.append("    keys: ").append(toIndentedString(keys)).append("\n");
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
