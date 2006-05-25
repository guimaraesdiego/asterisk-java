/*
 *  Copyright 2004-2006 Stefan Reuter
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */
package org.asteriskjava.manager;

import org.asteriskjava.manager.response.ManagerResponse;

/**
 * An interface to listen for responses received from an Asterisk server.
 * 
 * @see org.asteriskjava.manager.response.ManagerResponse
 * @author srt
 * @version $Id$
 */
public interface ManagerResponseListener
{
    /**
     * This method is called when a response is received.
     * 
     * @param response the response that has been received
     */
    void onManagerResponse(ManagerResponse response);
}
