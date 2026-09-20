# FinFlow Pro Android — GitHub APK Builder

## Phone workflow
1. Create a GitHub repository.
2. Upload the contents of this folder (not the ZIP itself) to the repository root.
3. Open **Actions** in GitHub.
4. Select **Build FinFlow Pro APK**.
5. Tap **Run workflow**.
6. After it finishes, open the workflow run and download the **FinFlowPro-APK** artifact.
7. Extract the artifact ZIP and install `app-debug.apk` on Android.

The HTML app is bundled locally, so its local features work without Internet. Supabase features require Internet.
