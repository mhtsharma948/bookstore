package net.realizeideas.oauth.bitbucket

import org.scribe.builder.api.DefaultApi10a
import org.scribe.model.Token

/**
 * @author: Konstantin Khisamov
 */
class BitbucketApi extends DefaultApi10a {
  
    @Override
    String getRequestTokenEndpoint() {
        "https://bitbucket.org/api/1.0/oauth/request_token"
    }

    @Override
    String getAccessTokenEndpoint() {
        "https://bitbucket.org/api/1.0/oauth/access_token"
    }

    @Override
    String getAuthorizationUrl(Token requestToken) {
        "https://bitbucket.org/api/1.0/oauth/authenticate?oauth_token=${requestToken.token}"
    }
}