

# DeleteDocxTableRowRangeRequest

Input to a delete DOCX table row range request

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**inputFileBytes** | **byte[]** | Optional: Bytes of the input file to operate on |  [optional] |
|**inputFileUrl** | **String** | Optional: URL of a file to operate on as input.  This can be a public URL, or you can also use the begin-editing API to upload a document and pass in the secure URL result from that operation as the URL here (this URL is not public). |  [optional] |
|**tablePath** | **String** | Path to the table to delete the row from |  [optional] |
|**tableRowRowIndexStart** | **Integer** | 0-based index of the row to begin deleting rows (e.g. 0, 1, 2, ...) in the table |  [optional] |
|**tableRowRowIndexEnd** | **Integer** | 0-based index of the row to stop deleting rows (e.g. 0, 1, 2, ...) in the table |  [optional] |



