package Acme.PurchaseOrder_1;

// -----( IS Java Code Template v1.2
// -----( CREATED: 2016-10-21 16:05:41 IST
// -----( ON-HOST: LP-54EE7532B12E.HCLT.CORP.HCL.IN

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
import com.wm.data.IData;
import com.wm.data.IDataCursor;
import com.wm.data.IDataUtil;
// --- <<IS-END-IMPORTS>> ---

public final class work

{
	// ---( internal utility methods )---

	final static work _instance = new work();

	static work _newInstance() { return new work(); }

	static work _cast(Object o) { return (work)o; }

	// ---( server methods )---




	public static final void endsWith (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(endsWith)>> ---
		// @sigtype java 3.5
		// [i] field:0:required string
		// [i] field:0:required suffix
		// [o] field:0:required value
		IDataCursor cursor = pipeline.getCursor();
		String string = IDataUtil.getString(cursor, "string");
		String suffix = IDataUtil.getString(cursor, "suffix");
		String value = string.endsWith(suffix)?"true" : "false";
		IDataUtil.put(cursor, "value", value);
		cursor.destroy();
		// --- <<IS-END>> ---

                
	}
}

