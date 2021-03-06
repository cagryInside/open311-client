/*
* Copyright (C) 2014 University of South Florida (sjbarbeau@gmail.com)
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*      http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package edu.usf.cutr.open311client.models;

import java.util.List;

/**
 * Model for attributes specified in open311 documentation.
 * http://wiki.open311.org/GeoReport_v2/
 * 
 * @author Cagri Cetin
 */
public class Open311Attribute {

  private String variable;
  private Integer code;
  private Boolean required;
  private Boolean answer_kept_private;
  private String datatype_description;
  private String datatype;
  private Integer order;
  private String description;
  private List<Object> values;

  public String getVariable() {
    return variable;
  }

  public void setVariable(String variable) {
    this.variable = variable;
  }

  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public Boolean getRequired() {
    return required;
  }

  public void setRequired(Boolean required) {
    this.required = required;
  }

  public String getDatatype_description() {
    return datatype_description;
  }

  public void setDatatype_description(String datatype_description) {
    this.datatype_description = datatype_description;
  }

  public Integer getOrder() {
    return order;
  }

  public void setOrder(Integer order) {
    this.order = order;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getDatatype() {
    return datatype;
  }

  public void setDatatype(String data_type) {
    this.datatype = data_type;
  }

  public List<Object> getValues() {
    return values;
  }

  public void setValues(List<Object> values) {
    this.values = values;
  }

  public Boolean getAnswer_kept_private() {
    return answer_kept_private;
  }

  public void setAnswer_kept_private(Boolean answer_kept_private) {
    this.answer_kept_private = answer_kept_private;
  }
}
