-- Migration generated by the command below; DO NOT EDIT.
-- hydra:generate hydra migrate gen

DROP INDEX hydra_oauth2_flow_client_id_subject_idx;
DROP INDEX hydra_oauth2_flow_cid_idx;
DROP INDEX hydra_oauth2_flow_login_session_id_idx;
DROP INDEX hydra_oauth2_flow_sub_idx;
DROP INDEX hydra_oauth2_flow_login_verifier_idx;
DROP INDEX hydra_oauth2_flow_consent_verifier_idx;