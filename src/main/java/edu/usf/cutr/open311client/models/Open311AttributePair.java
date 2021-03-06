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

/**
 * Attribute code value pair
 * 
 * @author Cagri Cetin
 */
public class Open311AttributePair {

  private Integer code;
  private String value;
  private String open311DataType;

  public Open311AttributePair(Integer code, String value,
      String open311DataType) {
    this.code = code;
    this.value = value;
    this.open311DataType = open311DataType;
  }

  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public String getOpen311DataType() {
    return open311DataType;
  }

  public void setOpen311DataType(String open311DataType) {
    this.open311DataType = open311DataType;
  }
}
