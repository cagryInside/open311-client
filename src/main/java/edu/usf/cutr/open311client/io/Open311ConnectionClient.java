/*
* Copyright (C) 2015 University of South Florida (sjbarbeau@gmail.com)
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
package edu.usf.cutr.open311client.io;

import edu.usf.cutr.open311client.models.NameValuePair;

import java.io.File;
import java.io.IOException;
import java.util.List;

public interface Open311ConnectionClient {

    String getMethod(String url, List<NameValuePair> params) throws IOException;

    String postMethod(String url, List<NameValuePair> params) throws IOException;

    String postMethod(String url, List<NameValuePair> params, File file) throws IOException;
}
