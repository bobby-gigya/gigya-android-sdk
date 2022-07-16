package com.gigya.android.sdk.auth;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.IntentSenderRequest;

import com.gigya.android.sdk.auth.models.WebAuthnAssertionResponse;
import com.gigya.android.sdk.auth.models.WebAuthnAttestationResponse;
import com.gigya.android.sdk.auth.models.WebAuthnGetOptionsResponseModel;
import com.gigya.android.sdk.auth.models.WebAuthnInitRegisterResponseModel;

public interface IFidoApiService {

    void register(ActivityResultLauncher<IntentSenderRequest> resultLauncher, WebAuthnInitRegisterResponseModel option);

    WebAuthnAttestationResponse onRegisterResponse(byte[] attestationResponse, byte[] credentialResponse);

    void sign(ActivityResultLauncher<IntentSenderRequest> resultLauncher, WebAuthnGetOptionsResponseModel options);

    WebAuthnAssertionResponse onSignResponse(byte[] fidoApiResponse, byte[] credentialResponse);

    void onFidoError(byte[] errorResponse);
}
