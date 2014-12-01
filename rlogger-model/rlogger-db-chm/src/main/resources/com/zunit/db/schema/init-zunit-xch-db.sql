--DROP SCHEMA "public"; #--;

CREATE SCHEMA "${db.rlogger.schema.name}"; #--;
ALTER SCHEMA "${db.rlogger.schema.name}" OWNER TO "${db.rlogger.user.name}"; #--;

REVOKE ALL ON DATABASE "${db.rlogger.name}" FROM public; #--;
REVOKE ALL ON SCHEMA "${db.rlogger.schema.name}" FROM public; #--;

GRANT CONNECT ON DATABASE "${db.rlogger.name}" TO "${db.rlogger.user.name}"; #--;
GRANT USAGE ON SCHEMA "${db.rlogger.schema.name}" TO "${db.rlogger.user.name}"; #--;
		
GRANT CONNECT ON DATABASE "${db.rlogger.name}" TO "${db.rlogger.client.user.name}"; #--;
GRANT USAGE ON SCHEMA "${db.rlogger.schema.name}" TO "${db.rlogger.client.user.name}"; #--;
ALTER DEFAULT PRIVILEGES GRANT INSERT, SELECT, UPDATE, DELETE ON TABLES TO "${db.rlogger.client.user.name}"; #--;
ALTER DEFAULT PRIVILEGES GRANT ALL ON SEQUENCES TO "${db.rlogger.client.user.name}"; #--;
ALTER DEFAULT PRIVILEGES GRANT EXECUTE ON FUNCTIONS TO "${db.rlogger.client.user.name}"; #--;

GRANT CONNECT ON DATABASE "${db.rlogger.name}" TO "${db.rlogger.management.user.name}"; #--;
GRANT USAGE ON SCHEMA "${db.rlogger.schema.name}" TO "${db.rlogger.management.user.name}"; #--;
ALTER DEFAULT PRIVILEGES GRANT INSERT, SELECT, UPDATE, DELETE ON TABLES TO "${db.rlogger.management.user.name}"; #--;
ALTER DEFAULT PRIVILEGES GRANT ALL ON SEQUENCES TO "${db.rlogger.management.user.name}"; #--;
ALTER DEFAULT PRIVILEGES GRANT EXECUTE ON FUNCTIONS TO "${db.rlogger.management.user.name}"; #--;

GRANT CONNECT ON DATABASE "${db.rlogger.name}" TO "${db.rlogger.auth.user.name}"; #--;
GRANT USAGE ON SCHEMA "${db.rlogger.schema.name}" TO "${db.rlogger.auth.user.name}"; #--;
ALTER DEFAULT PRIVILEGES GRANT SELECT ON TABLES TO "${db.rlogger.auth.user.name}"; #--;
ALTER DEFAULT PRIVILEGES GRANT EXECUTE ON FUNCTIONS TO "${db.rlogger.auth.user.name}"; #--;

