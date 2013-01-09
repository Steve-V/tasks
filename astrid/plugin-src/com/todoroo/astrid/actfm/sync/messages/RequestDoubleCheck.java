package com.todoroo.astrid.actfm.sync.messages;

import org.json.JSONException;
import org.json.JSONObject;

import com.todoroo.astrid.dao.RemoteModelDao;
import com.todoroo.astrid.data.RemoteModel;

public class RequestDoubleCheck<TYPE extends RemoteModel> extends ClientToServerMessage<TYPE> {

    public RequestDoubleCheck(long id, Class<TYPE> modelClass, RemoteModelDao<TYPE> modelDao) {
        super(id, modelClass, modelDao);
    }

    @Override
    protected void serializeExtrasToJSON(JSONObject serializeTo) throws JSONException {
        // No extras
    }

    @Override
    protected String getTypeString() {
        return "RequestDoubleCheck"; //$NON-NLS-1$
    }
}
