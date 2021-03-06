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

package edu.usf.cutr.open311client.exceptions;

/**
 * Can be thrown if open311 is not specified
 * 
 * @author Cagri Cetin
 */
public class Open311NotFoundException extends IllegalStateException {

  private static final long serialVersionUID = 3984309139124501383L;

  public Open311NotFoundException(String jurisdiction) {
    super("Open311 couldn't found for jurisdiction id : " + jurisdiction);
  }
}
