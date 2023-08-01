/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.guacamole.auth.procyon;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.apache.guacamole.GuacamoleException;
import org.apache.guacamole.net.auth.Credentials;
// import org.apache.guacamole.net.auth.credentials.CredentialsInfo;
// import org.apache.guacamole.net.auth.credentials.GuacamoleInvalidCredentialsException;
import org.apache.guacamole.auth.procyon.user.AuthenticatedUser;
import org.apache.guacamole.auth.procyon.user.UserContext;
// import java.security.Principal;
import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Service providing convenience functions for the Procyon
 * AuthenticationProvider implementation.
 */
public class AuthenticationProviderService {

    /**
     * Logger for this class.
     */
    private static final Logger logger = LoggerFactory.getLogger(AuthenticationProviderService.class);

    /**
     * Provider for AuthenticatedUser objects.
     */
    @Inject
    private Provider<AuthenticatedUser> authenticatedUserProvider;

        /**
     * Provider for UserContext objects.
     */
    @Inject
    private Provider<UserContext> userContextProvider;

    /**
     * Returns an AuthenticatedUser representing the user authenticated by the
     * given credentials.
     *
     * @param credentials
     *     The credentials to use for authentication.
     *
     * @return
     *     An AuthenticatedUser representing the user authenticated by the
     *     given credentials.
     *
     * @throws GuacamoleException
     *     If an error occurs while authenticating the user, or if access is
     *     denied.
     */
    public AuthenticatedUser authenticateUser(Credentials credentials)
            throws GuacamoleException {

        // Pull HTTP header from request if present
        HttpServletRequest request = credentials.getRequest();
        if (request != null) {

            // Get the username from the header configured in guacamole.properties
            String authHdr = request.getHeader("Authorization");
            logger.info("CZARAS "+authHdr, authHdr);
        }

        AuthenticatedUser authenticatedUser = authenticatedUserProvider.get();
        authenticatedUser.init("czaras", credentials);
        return authenticatedUser;
        
    }

    public UserContext getUserContext(org.apache.guacamole.net.auth.AuthenticatedUser authenticatedUser) throws GuacamoleException {

        UserContext context = userContextProvider.get();
        return context;
    }

}
