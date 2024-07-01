
# This is a sample api mustache template.  It is representing a fictitious
# language and won't be usable or compile to anything without lots of changes.
# Use it as an example.  You can access the variables in the generator object
# like such:

# use the package from the `apiPackage` variable
package: org.openapitools.api

# operations block
classname: DefaultApi

# loop over each operation in the API:

# each operation has an `operationId`:
operationId: add

# and parameters:
hXRequest: Boolean
id: Long
title: String
completed: Boolean
url: String
order: Integer


# each operation has an `operationId`:
operationId: delete

# and parameters:
id: Long
hXRequest: Boolean


# each operation has an `operationId`:
operationId: edit

# and parameters:
id: Long
todo: Todo


# each operation has an `operationId`:
operationId: list

# and parameters:


# each operation has an `operationId`:
operationId: todoDeleteCompleted

# and parameters:


# each operation has an `operationId`:
operationId: todoGetOne

# and parameters:
id: Long


# each operation has an `operationId`:
operationId: todoOpt

# and parameters:


# end of operations block
