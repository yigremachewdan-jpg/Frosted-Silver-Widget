# Frosted Silver Widget — phone-friendly cloud build

This is an Android Studio project plus a GitHub Actions workflow. You do not need a PC to trigger the cloud build.

## Build from your phone
1. Sign in to GitHub in your phone browser and create a **new public or private repository** named `Frosted-Silver-Widget`.
2. Download and extract this ZIP on your phone using My Files. (If GitHub's mobile upload interface cannot upload folders, open GitHub in your browser's **Desktop site** mode and use Add file → Upload files; upload the extracted project contents, including the hidden `.github` folder.)
3. Commit the files to the repository's `main` branch.
4. Open the repository → **Actions** → **Build Frosted Silver Widget APK** → **Run workflow**.
5. When the run finishes successfully, open the run → Artifacts → download `frosted-silver-widget-debug-apk`.
6. Extract the downloaded artifact ZIP. Tap `app-debug.apk` to install. Android may ask you to allow installs from your browser or file manager; allow it only for this file source.

## What this starter currently does
- Provides a native home-screen widget layout inspired by the supplied reference: silver clock/date, frosted charcoal forecast panel, and smoked-glass media panel.
- Updates the clock and date when Android refreshes the widget.

## Not implemented yet
This is an early visual prototype, not the finished replica. Live weather and multi-day forecast data, real album art, media-session controls, exact metallic gradient typography, and true live background blur are not implemented. The sample weather and media labels are placeholders. Do not treat the displayed forecast as live information.

## Add the widget
After installation: long-press the home screen → Widgets → Frosted Silver Widget. Resize it to fit the design.

Default location label: Addis Ababa. No location permission is requested by this prototype.
