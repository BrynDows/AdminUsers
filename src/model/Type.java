package model;

public enum Type {

	/**
	 * PARA OPERACIONES QUE RETORNAR� UN LISTADO: SELECTS.
	 */
	EXECUTE_QUERY,
	/**
	 * PARA OPERACIONES QUE RETORNAR�N UN ENTERO: INSERTS, UPDATE, DELETE
	 */
	EXECUTE_UPDATE
}