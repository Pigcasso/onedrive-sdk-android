// ------------------------------------------------------------------------------
// Copyright (c) 2015 Microsoft Corporation
// 
// Permission is hereby granted, free of charge, to any person obtaining a copy
// of this software and associated documentation files (the "Software"), to deal
// in the Software without restriction, including without limitation the rights
// to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
// copies of the Software, and to permit persons to whom the Software is
// furnished to do so, subject to the following conditions:
// 
// The above copyright notice and this permission notice shall be included in
// all copies or substantial portions of the Software.
// 
// THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
// IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
// FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
// AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
// LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
// OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
// THE SOFTWARE.
// ------------------------------------------------------------------------------

package com.onedrive.sdk.generated;

import com.onedrive.sdk.concurrency.*;
import com.onedrive.sdk.core.*;
import com.onedrive.sdk.extensions.*;
import com.onedrive.sdk.http.*;
import com.onedrive.sdk.generated.*;
import com.onedrive.sdk.options.*;
import com.onedrive.sdk.serializer.*;

import java.util.*;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Permission Request.
 */
public interface IBasePermissionRequest extends IHttpRequest {

    void get(final ICallback<Permission> callback);

    Permission get() throws ClientException;

    /**
     * @deprecated  As of release 1.1.3, replaced by {@link #patch(Permission, ICallback)}
     */
    @Deprecated void update(final Permission sourcePermission, final ICallback<Permission> callback);

    /**
     * @deprecated  As of release 1.1.3, replaced by {@link #patch(Permission)}
     */
    @Deprecated Permission update(final Permission sourcePermission) throws ClientException;

    void patch(final Permission sourcePermission, final ICallback<Permission> callback);

    Permission patch(final Permission sourcePermission) throws ClientException;

    void delete(final ICallback<Void> callback);

    void delete()  throws ClientException;

    /**
     * @deprecated  As of release 1.1.3, replaced by {@link #post(Permission, ICallback)}
     */
    @Deprecated void create(final Permission newPermission, final ICallback<Permission> callback);

    /**
     * @deprecated  As of release 1.1.3, replaced by {@link #post(Permission)}
     */
    @Deprecated Permission create(final Permission newPermission) throws ClientException;

    void post(final Permission newPermission, final ICallback<Permission> callback);

    Permission post(final Permission newPermission) throws ClientException;

    IBasePermissionRequest select(final String value);

    IBasePermissionRequest top(final int value);

    IBasePermissionRequest expand(final String value);
}
