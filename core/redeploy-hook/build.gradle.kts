plugins {
    `mikbot-plugin`
    `mikbot-module`
    `mikbot-publishing`
}

group = "dev.schlaubi.mikbot"
version = "1.0.1"

mikbotPlugin {
    description.set("Plugin adding a /redeploy command, backed by a webhook")
}
